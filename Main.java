package happyfamily;

public class Main {

    public static void main(String[] args) {
        Human mother= new Human("Ann" ,"Murphy",1989);
        Human father = new Human("Jack","Murphy", 1985);
        Pet pet = new Pet ("dog", "Cloud", 1, 8,
                new String[] {"playing","eating" , "walking"} );

        Family mFamily = new Family(mother,father);

        Human child1 = new Human("Belle", "Murphy", 2002,
                110, new String[][]{{"sunday","reading book"}},mFamily);
        Human child2 = new Human("Jacob","Murphy",2005,
                102,new String[][]{{"sunday,do sport"}},mFamily);

       mFamily.setPet(pet);

        mFamily.addChild(child1);
       mFamily.addChild(child2);
        System.out.println(mFamily+" -- "+mFamily.countFamily());

        mFamily.deleteChild(5);
        System.out.println(mFamily);





    }
}
