/*
 * package learn.streamapi;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.Comparator; import java.util.HashMap; import
 * java.util.LinkedHashMap; import java.util.LinkedList; import java.util.List;
 * import java.util.Map; import java.util.Optional; import java.util.Set; import
 * java.util.function.BiFunction; import java.util.function.BinaryOperator;
 * import java.util.function.Function; import java.util.function.Predicate;
 * import java.util.stream.Collectors; import java.util.stream.Stream;
 * 
 * //import jdk.javadoc.internal.doclets.toolkit.util.Comparators;
 * 
 * 
 * //import jdk.javadoc.internal.doclets.toolkit.util.Comparators; record
 * Employees(int id,String name,String department) {} record Workers(String
 * name,long Salary) {} //map->(key(department),Value(Employee)) public class
 * LearningStreamApi {
 * 
 * public static void main(String[] args) { //method1(); // method2();
 * //method3(); //method4(); List<Orders> orderList=Arrays.asList( new
 * Orders(101,"Name1",OrderStatus.DELIVERED), new
 * Orders(101,"Name2",OrderStatus.DELIVERED), //null, new
 * Orders(103,"Name3",OrderStatus.NOT_DELIVERED), new
 * Orders(104,"Name4",OrderStatus.NOT_DELIVERED), new
 * Orders(105,"Name5",OrderStatus.NOT_DELIVERED) );
 * //System.out.println(method5(orderList)); //method7(orderList);
 * method8(orderList); List<Workers> workersList=Arrays.asList( new
 * Workers("Worker1", 25000), new Workers("Worker2", 3000), new
 * Workers("Worker3", 40000) );
 * 
 * //method6(workersList);
 * 
 * 
 * }
 * 
 * 
 * 
 * private static void method8(List<Orders> orderList) { System.out.println(
 * orderList.stream() .filter(eachItem->
 * eachItem.status()==OrderStatus.DELIVERED)
 * .collect(Collectors.toMap(key->key.orderid(),
 * value->value.itemname(),(existing, incoming) -> incoming)) ); }
 * 
 * 
 * 
 * private static void method7(List<Orders> orderList) {
 * Map<OrderStatus,List<Orders>> insertItem=new HashMap<OrderStatus,
 * List<Orders>>(); // List<Orders> listofOrders1=new ArrayList<>(); for(Orders
 * listoforders:orderList) { //get the current item status OrderStatus
 * orderStatus1=listoforders.status();
 * 
 * //before insert the the this item is prsenr in map List<Orders>
 * listofOrders=insertItem.get(orderStatus1); if(listofOrders==null) {
 * listofOrders=new ArrayList<Orders>(); } listofOrders.add(listoforders);
 * 
 * insertItem.put(orderStatus1, listofOrders);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * } System.out.println(insertItem);
 * 
 * }
 * 
 * 
 * 
 * private static void method6(List<Workers> workersList) { workersList.stream()
 * //.filter(eachItem-> eachItem.Salary()) .map(eachItem-> eachItem.Salary())
 * .sorted(Comparator.naturalOrder()) .skip(1) .limit(1)
 * .forEach(System.out::println);
 * 
 * }
 * 
 * 
 * 
 * private static Map<OrderStatus, Long> method5(List<Orders> orderList) {
 * return orderList.stream() .filter(eachitem -> eachitem!=null) .collect(
 * Collectors.groupingBy( eachitem ->eachitem.status(), Collectors.counting() )
 * );
 * 
 * }
 * 
 * 
 * 
 * private static void method4() {
 * 
 * Predicate<Integer> a=n->false; //BinaryOperator<Integer> b=(n,m)->1;
 * System.out.println( Stream.of(18,33,44,55,17,88,20,19)
 * //.peek(System.out::println) .filter((n)->n>=30) .reduce(0, (n,m)->n+m) //
 * .collect(Collectors.averagingInt(n->n)) //
 * .collect(Collectors.summingInt(n->n)) // .collect(Collectors.counting()) //
 * .collect(Collectors.toList()).size() // .count() // .allMatch(n->n>=18) //
 * .noneMatch(n->n>=90) // .anyMatch(n->n>=50) //above >18 //less <18
 * 
 * );
 * 
 * 
 * 
 * }
 * 
 * private static void method3() { //Function<T // BiFunction<T, U, R> Orders
 * o1=new Orders(101, "item1", OrderStatus.PACKING); Orders o2=new Orders(102,
 * "item2", OrderStatus.RETURN1); Orders o3=new Orders(103, "item3",
 * OrderStatus.NOT_DELIVERED); Orders o4=new Orders(104, "item4",
 * OrderStatus.DELIVERED); Orders o5=new Orders(105, "item5existing",
 * OrderStatus.DELIVERED); Orders o6=new Orders(105, "item5New",
 * OrderStatus.DELIVERED); List<Orders>
 * listoforders=Arrays.asList(o1,o2,o3,o4,o5,o6); System.out.println(
 * listoforders.stream()
 * .filter(eachorders->eachorders.status()==OrderStatus.DELIVERED) //
 * .map(itemnames->itemnames.orderid())
 * .collect(Collectors.toMap(Orders::orderid, Orders::itemname,(existing,
 * incoming) -> incoming)) );
 * 
 * 
 * }
 * 
 * private static void method2() { List<Integer> ls=new
 * ArrayList<Integer>(Arrays.asList(1,2,3,6,4,5)); Optional<Integer>
 * numbers=ls.stream() .filter(n->n%7==0) .findFirst();
 * System.out.println(numbers);
 * 
 * }
 * 
 * private static void method1() { Employee employeeobj1=new Employee("e1",
 * Arrays.asList("java","spring")); Employee employeeobj2=new Employee("e2",
 * Arrays.asList("java","spring","docker")); Employee employeeobj3=new
 * Employee("e3", Arrays.asList("apis","c++"));
 * 
 * List<Employee> ls=new
 * ArrayList<Employee>(Arrays.asList(employeeobj1,employeeobj2,employeeobj3));
 * List<String> courseList=ls.stream() .map(eachEmployee
 * ->eachEmployee.getCourselist().stream()) //.flatMap(eachEmployee
 * ->eachEmployee.getCourselist().stream()) .sorted(Comparator.naturalOrder())
 * //.distinct() .collect(Collectors.toList());
 * System.out.println("courses "+courseList);
 * 
 * }
 * 
 * }
 * 
 * 
 * record Employeerec(String name,List<String> courseNmae) {}
 * 
 * class Employee{ private String name; private List<String> courselist;
 * 
 * public Employee(String name, List<String> courselist) { super(); this.name =
 * name; this.courselist = courselist; } public String getName() { return name;
 * } public void setName(String name) { this.name = name; } public List<String>
 * getCourselist() { return courselist; } public void setCourselist(List<String>
 * courselist) { this.courselist = courselist; }
 * 
 * 
 * }
 * 
 */