# Assignment 1

Your task is to go to the csci3055u/a1/core.clj and fill in the function bodies.

A makefile has been provided that is all set to execute the functions int he core.clj. You simply need to execute `make <function name>` in terminal at the base of the project directory. Feel free to modify the arguments to test different operations.

## Step 1. Include Your Name

Near the top of the *csci3055u/a1/core.clj* file make sure you put your name and student number in the comments provided:

```clojure
;; Name: 
;; Student Number: 100******
```

## Step 2. Fill in Functions Provided

You are expected to fill in the function bodies of the functions previously defined in *csci3055u/a1/core.clj* that have `;; YOUR CODE GOES HERE` inside the body.

If you need to add additional functions to your code, please do so in the area indicated near the top of *csci3055u/a1/core.clj*.

## Sample Execution and Output

### (defn read-file...

```bash
make read-file
read-file -  csci3055u-a1.txt
201609|Foun.of Ditgl Teach & Lrn Tech|AEDT 1120U|12|M|10|13|0|Virtual ONLINE11
201609|Foun.of Ditgl Teach & Lrn Tech|AEDT 1120U|18|M|10|19|0|Virtual ONLINE9
201609|Digital Commun. Technologies|AEDT 1160U|12|M|10|13|0|Virtual ONLINE10
201609|Digital Commun. Technologies|AEDT 1160U|18|M|10|19|0|Virtual ONLINE5
201609|Graphic Desgn, Digtl Tech.|AEDT 2130U|12|W|10|13|0|Virtual ONLINE12
...way more output
```

### (defn distinct-code...

```bash
make distinct-code
distinct-code -  csci3055u-a1.txt
#{NURS 0420U EDUC 3210U ENGR 3260U SSCI 4099U NUCL 4510U AEDT 3120U COMM 1420U CHEM 3530U SSCI 2020U PSYC 2060U COMM 2210U INFR 4320U PHY 4020U NUCL 5060G CSCI 4110U MANE 4280U INFR 3495U COMM 3410U BUSI 3930U SSCI 2031U ENGR 3750U HLSC 2825U HLSC 1200U PSYC 1000U BUSI 2603U MATH 3030U MECE 4410U ENGR 3200U INFR 2395U COMM 2530U MCSC 6000G MATH 1000U BUSI 2620U NURS 2701U SSCI 6920G BUSI 3350U MECE 2640U CSCI 1040U INFR 3120U MECE 4210U MATH 1010U HLSC 5322G BIOL 1010U NURS 3400U SOFE 2800U CHEM 4050U PSYC 5510G INFR 4310U BUSI 3040U BUSI 4701U SSCI 1910U...
```

### (defn distinct-code-with-labs...

```bash
```

### (defn time-earliest-latest

```bash
make time-earliest-latest
Earliest start time is:  810
Latest end time is:  2130
```

### (defn pr-schedule

With my makefile settings as:
```make
pr-schedule:
	@$(run_clj) pr-schedule $(txt) { :code \"CSCI 3055U\" }
```

Terminal:
```bash
make pr-schedule
pr-schedule -  csci3055u-a1.txt   CSCI 3055U   nil   nil   nil   nil
```

Output schedule.txt
```
T 12:40-14:0 - CSCI 3055U - Programming Languages - University Building A1 UA2240
R 11:10-12:30 - CSCI 3055U - Programming Languages - University Building A1 UA2240
```

### (defn free-room 

```bash
```

## Some Helpful Resources *hint hint*

