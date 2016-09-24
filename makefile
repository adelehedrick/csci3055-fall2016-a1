cp = ./clojure-1.8.0.jar:.
ns = csci3055u.a1.core
run_clj = java -cp $(cp) clojure.main -m $(ns)
txt =  csci3055u-a1.txt

distinct-code: 
	@$(run_clj) distinct-code $(txt)

distinct-code-with-labs:
	@$(run_clj) distinct-code-with-labs $(txt)

pr-schedule:
	@$(run_clj) pr-schedule $(txt) \
		{ 	:code \"CSCI 3055U\" \
				:title \"Programming Languages\" \
				:room \"University Building A1 UA2240\" \
				:weekday \"R\" \
				:time \"11:10\" }

free-room:
	@$(run_clj) free-room $(txt) \
		{ 	:room \"University Building A1 UA2240\" \
				:weekday \"R\" \
				:time \"11:10\" }
