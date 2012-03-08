
A [giter8] [Akka] 2.0 tutorial project using [Scala] and [sbt].

Prerequisites to use this tutorial is to have [sbt] and [giter8] installed.

The next step is to open a terminal window and::
	
	$ cd /Users/theuser/code (or where ever you would like your code to end up)
	$ g8 typesafehub/akka-first-tutorial-scala
    
    Akka 2.0 project using Scala and sbt 

	organization [org.example]:   
	package [org.example]: 
	name [Akka Tutorial Project]: 
	akka_version [2.0]: 
	version [0.1-SNAPSHOT]:

	Applied typesafehub/akka-first-tutorial-scala.g8 in akka-tutorial-project

Okay, so now you have created the tutorial as a local project on your computer.
To run and test it use SBT::

	$ cd akka-tutorial-project
	$ sbt
	[info] Loading global plugins from /Users/theuser/.sbt/plugins
	[info] Loading project definition from /Users/theuser/code/akka-tutorial-project/project
	[info] Set current project to Akka Tutorial Project (in build file:/Users/theuser/code/akka-tutorial-project/)
    > run
	[info] Running org.example.Pi 

		Pi approximation: 		3.1415926435897887
		Calculation time: 	513 milliseconds
	[success] Total time: 1 s, completed Mar 8, 2012 2:50:24 PM
	> test
	[info] WorkerSpec:
	[info] Worker 
	[info] - must calculate pi correctly
	[info] Passed: : Total 1, Failed 0, Errors 0, Passed 1, Skipped 0
	[success] Total time: 0 s, completed Mar 8, 2012 2:51:20 PM
	> 

[giter8]: https://github.com/n8han/giter8
[Akka]: http://akka.io
[Scala]: http://www.scala-lang.org/
[sbt]: http://github.com/harrah/xsbt/
