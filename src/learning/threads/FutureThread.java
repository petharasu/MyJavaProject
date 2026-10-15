package learning.threads;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class FutureThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		creatingFutureThread();
		creatingCompletableFutureThread();

	}

	private static void creatingCompletableFutureThread() {
		
		ExecutorService execServ = Executors.newSingleThreadExecutor();
		
		Supplier<String> task1 = () -> {
			IO.println("Task1 Started at : " + LocalTime.now());
			try {
				Thread.sleep(Duration.ofSeconds(2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			IO.println("Task1 Completed at : " + LocalTime.now());
			return "The Response";
		};
		
		Runnable task2 = () -> {
			IO.println("Task2 Started at : " + LocalTime.now());
			try {
				Thread.sleep(Duration.ofSeconds(2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			IO.println("Task2 Completed at : " + LocalTime.now());
			return;
		};
		
		
		
		var t1 = CompletableFuture.supplyAsync(task1);
		var t2 = CompletableFuture.runAsync(task2);
		IO.println("Both task supplied: " + LocalTime.now());
		
		
		return;
	}

	private static void creatingFutureThread() throws InterruptedException, ExecutionException {
		Callable<String> task1 = () -> {
			System.out.println(Thread.currentThread().getName());
			return "First task completed";
		};

		var executer = Executors.newSingleThreadExecutor();
		Future<String> result=executer.submit(task1);
		System.out.println("result "+
		result.get()); //blocking

	}

}
