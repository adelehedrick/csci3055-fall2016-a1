(ns csci3055u.a1.core
	(use clojure.java.io)
	(use [clojure.string :only (split join)])
	(use [clojure.set :only (select)]))

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

) ;; end defn read-file


(defn distinct-code 
	"Output to the console the unique course codes found in the file 'filename'"
	[filename]

	(println "distinct-code - " filename)

	;; YOUR CODE GOES HERE

) ;; end defn distinct-code


(defn time-earliest-latest
	"Read in the file, and output the earliest start time, and the latest end time."
	[filename]

	;; YOUR CODE GOES HERE

) ;; end defn time-earliest-latest

(defn pr-schedule 
	"This time you are going to write to a file. All of these keys are optional. The ones that are set will be used as filters on the data. You need to output the day, start time, end time, code, title and location, with each record on its own line."
	[filename {:keys [code title room weekday time_] :or { code nil title nil room nil weekday nil time_ nil } } ]

	(println "pr-schedule - " filename " " code " " title " " room " " weekday " " time_)

	;; reminder: the file you print to must be 'schedule.txt'

	;; YOUR CODE GOES HERE

) ;; end defn pr-schedule


(defn free-room 
	"For this one, you need to find all the times that rooms are free, filter the data based on the :keys and output results to the console. Example: If I provide the keys :weekday and :time then I want a print out of the weekday, time and room (e.g. R - 8:10 to 11:40 - University Building A1 UA2240) for every segment that matches the :weekday and :time."
	[filename {:keys [ weekday time_ room ] :or { weekday nil time_ nil room nil} } ]

	(println "free-room - " filename " " room " " weekday " " time_)

	;; YOUR CODE GOES HERE

) ;; end defn free-room

(defn -main 
	"Do not modify the main method! It will break the makefile and your assignment!"
	[fun-name file-name & args]
	(if (empty? args)
		((ns-resolve 'csci3055u.a1.core (symbol fun-name)) file-name)	
		(let [keys (eval (read-string (join " " args)))]
			((ns-resolve 'csci3055u.a1.core (symbol fun-name)) file-name keys))))
