(ns csci3055u.a1.core
	(use clojure.java.io)
	(use [clojure.string :only (split join)]))

;; Name: 
;; Student Number: 100******

;; ========= PLACE YOUR OWN ADDITIONAL FUNCTIONS HERE ==========

;; feel free to create any additional functions here that 
;; you may need to complete the functions below.

;; ========= END ADDITIONAL FUNCTIONS===========================

(defn read-file 
	"This is a warm-up! Simply read the contents of the file associated to the argument 'filename' and print the contents to the console."
	[filename]

	(println "read-file - " filename)

	;; YOUR CODE GOES HERE

)


(defn distinct-code 
	"Output to the console the unique course codes found in the file 'filename'"
	[filename]

	(println "distinct-code - " filename)

	;; YOUR CODE GOES HERE

) ;; end defn distinct-code


(defn distinct-code-with-labs 
	"Similar to the previous function, but now I want you to output to the console the unique course codes that have labs."
	[filename]

	(println "distinct-code-with-labs - " filename)

	;; YOUR CODE GOES HERE

) ;; end defn distinct-code-with-labs

(defn time-earliest-latest
	"Read in the file, and output the earliest start time, and the latest end time."
	[filename]

	;; YOUR CODE GOES HERE

) ;; end defn time-earliest-latest

(defn pr-schedule 
	"This time you are going to write to a file. All of these keys are optional. The ones that are set will be used as filters on the data. Any key that is not set needs to be included in the output. Example: if I provide the :code then the data is filtered to print the title, room, weekday and time to the text-file 'schedule.txt' that all have the code defined by :code"
	[filename {:keys [code title room weekday time]}]

	(println "pr-schedule - " filename " " code " " title " " room " " weekday " " time)

	;; reminder: the file you print to must be 'schedule.txt'

	;; YOUR CODE GOES HERE

) ;; end defn pr-schedule


(defn free-room 
	"For this one, you need to find all the times that rooms are free, filter the data based on the :keys and output results to the console. Example: If I provide the keys :weekday and :time then I want a print out of the weekday, time and room (e.g. R - 8:10 to 11:40 - University Building A1 UA2240) for every segment that matches the :weekday and :time."
	[filename {:keys [weekday time room]}]

	(println "free-room - " filename " " room " " weekday " " time)

	;; YOUR CODE GOES HERE

) ;; end defn free-room

(defn -main 
	"Do not modify the main method! It will break your assignment!"
	[fun-name file-name & args]
	(if (empty? args)
		((ns-resolve 'csci3055u.a1.core (symbol fun-name)) file-name)	
		(let [keys (eval (read-string (join " " args)))]
			((ns-resolve 'csci3055u.a1.core (symbol fun-name)) file-name keys))))
