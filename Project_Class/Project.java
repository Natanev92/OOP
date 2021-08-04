package Project_Class;
import java.util.ArrayList;

class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getElevatorPitch() {
        String cost = String.valueOf(this.initialCost);
        String elevatorPitch = String.format("%s ($%s): %s", this.name, cost, this.description);
        return elevatorPitch;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double cost) {
        this.initialCost = cost;
    }


}

class Portfolio {
    private ArrayList<Project> projects = new ArrayList<Project>();
    
    public Portfolio() {
    }

    public String addProject(Project project) {
        if (!this.projects.contains(project)) {
            this.projects.add(project);
            return "Project successfully added!";
        }
        else {
            return "This project has already been added to this portfolio.";
        }
    }

    public String getProject(Project project) {
        if (this.projects.contains(project)) {
            return project.getElevatorPitch();
        }
        else {
            return "The project is not in this portfolio.";
        }
    }

    public double getPortfolioCost() {
        double totalCost = 0;
        for (int i=0; i<this.projects.size(); i++) {
            totalCost = totalCost + this.projects.get(i).getInitialCost();
        }
        return totalCost;
    }

    public void showPortfolio() {
        for (int i=0; i<this.projects.size(); i++) {
            System.out.println(this.projects.get(i).getElevatorPitch());
        }
        System.out.println("Total portfolio cost: " + this.getPortfolioCost());
    }

}
