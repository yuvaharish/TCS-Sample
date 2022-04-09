package constructor;

public class Parent extends GrandParent{
	
public Parent() {
	System.out.println("i am parent const");
}

public Parent(int a) {
	System.out.println("i am parent parmenterized const"+a);
}
}
