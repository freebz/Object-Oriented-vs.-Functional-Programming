// Example 2-10. Parsing the headings out of a file

public void addWorker(Worker worker) {
    workers.add(worker);
}

public static AssemblyLine newLine() {
    AssemblyLine line = new AssemblyLine();
    line.addWorker(new Manager());
    line.addWorker(new AssemblyWorker());
    line.addWorker(new Robot());
    return line;
}
