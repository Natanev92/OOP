package Project_Class;
public class TestProjectClass {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("Project");
        Project p3 = new Project("Next Project", "This is the next project we'll be working on.");
        Project p4 = new Project();
        Portfolio portfolio1 = new Portfolio();

        p1.setName("1st Project");
        p1.setDescription("First project.");
        p2.setDescription("This project is a secret.");
        p3.setName(" Project");
        p1.setInitialCost(10000);
        p2.setInitialCost(4000);
        p3.setInitialCost(6000);

        // Test portfolio functionality
        // System.out.println(portfolio1);
        portfolio1.addProject(p1);
        portfolio1.addProject(p2);
        portfolio1.addProject(p3);
        portfolio1.showPortfolio();
        System.out.println(portfolio1.addProject(p1));
        System.out.println(portfolio1.getProject(p4));

    }
}