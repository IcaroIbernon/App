
public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;

	public Computer() {
	    this.cpu = new CPU();
	    this.memory = new Memory();
	    this.hardDrive = new HardDrive();
	}

	public void startComputer() {
	    cpu.freeze();
	    memory.load(123, hardDrive.read(123, 123));
	    cpu.jump(123);
	    cpu.execute();
	}

}
