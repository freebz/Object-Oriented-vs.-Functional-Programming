// Example 2-11. Parsing the headings out of a file

class StructualWorker {
    def work(step:ProductionStep) {
	println("I'm working on: " + step.getName)
    }
}

def addWorker(worker) {
    workers += worker
}

def newLine() = {
    val line = new AssemblyLine
    line.addWorker(new Manager())
    line.addWorker(new StructuralWorker())
    line.addWorker(new Robot())
    line
}
