package com.andela.tutorials;

class RunnableThread implements Runnable {

	Thread runner;

	public RunnableThread() {
	}

	public RunnableThread(String threadName) {
		runner = new Thread(this, threadName);
		System.out.println(runner.getName());
		runner.start();
	}

	public void run() {
		System.out.println(Thread.currentThread());
	}

}

class ServerThread extends Thread {
	public ServerThread() {
	}

	public ServerThread(String threadName) {
		super(threadName);
		System.out.println(this);
		start();
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class RunnableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread dbThread = new Thread(new RunnableThread(), "Database Thread");
		Thread monitoringThread = new Thread(new RunnableThread(),
				"Monitoring Thread");
		RunnableThread connectionThread = new RunnableThread(
				"Connection Health Thread");
		ServerThread serverThread = new ServerThread("RTMP Server Thread");

		dbThread.start();
		monitoringThread.start();

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread());
	}

}
