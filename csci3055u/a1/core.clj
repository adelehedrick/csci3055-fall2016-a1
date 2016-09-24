(ns csci3055u.a1.core
	(use clojure.java.io)
	(use [clojure.string :only (split join)]))


(defn distinct-code [filename]

	(println "distinct-code function called on filename " filename)

) ;; end defn distinct-code


(defn distinct-code-with-labs [filename]

	(println "distinct-code-with-labs function called on filename " filename)

) ;; end defn distinct-code-with-labs


(defn pr-schedule [filename {:keys [code title room weekday time]}]

	(println "pr-schedule function called on filename " filename " " code " " title " " room " " weekday " " time)

) ;; end defn pr-schedule


(defn free-room [filename {:keys [weekday time room]}]

	(println "free-room function called on filename " filename " " room " " weekday " " time)

) ;; end defn free-room

(defn -main [fun-name file-name & args]
	(if (empty? args)
		((ns-resolve 'csci3055u.a1.core (symbol fun-name)) file-name)	
		(let [keys (eval (read-string (join " " args)))]
			((ns-resolve 'csci3055u.a1.core (symbol fun-name)) file-name keys)
		)	
	)
)
