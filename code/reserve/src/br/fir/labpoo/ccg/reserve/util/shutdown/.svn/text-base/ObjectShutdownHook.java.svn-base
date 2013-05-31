package br.fir.labpoo.ccg.reserve.util.shutdown;

public class ObjectShutdownHook extends Thread {
	private ShutdownListener obj;

	public ObjectShutdownHook(ShutdownListener obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		try {
			obj.onShutdown();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}