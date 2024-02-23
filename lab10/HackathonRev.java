public class Hackathon 
{
    private static int MAX_NO_OF_PROJECTS = 6;
    private static int INDICATOR_COUNT  = 4;
    private static int[] INDICATOR_WEIGHTS = {10, 25, 30, 35};
    private static int projectCount;
    private static Project[] investableProjects;
    private static Project[] projects ;
    private static Project[] finalProjects;
    private static int MAX_INVESTABLE_AMOUNT = 1500000;
    

    Hackathon()
    {
        projectCount = 0;
        Hackathon.projects = new Project[9];
    }
    //getters
    public int getMaxNoOfProjects()
    {
        return Hackathon.MAX_NO_OF_PROJECTS;
    }
    public int getIndicatorCount()
    {
        return Hackathon.INDICATOR_COUNT;
    }
    public int[] getIndicatorWeights()
    {
        return Hackathon.INDICATOR_WEIGHTS;
    }

    public static void addProject(Project project)
    {
        projects[projectCount] = project;
        projectCount++;
    }
    public static void showTable(Project[] projects)
    {
        System.out.println("Initial Table");
        System.out.println("*************");
            String table[][] = new String[1][5];
            table[0][0] = "Project ID ";
            table[0][1] = "Indicator 1 ";
            table[0][2] = "Indicator 2 ";
            table[0][3] = "Indicator 3 ";
            table[0][4] = "Indicator 4 ";
            for(int t = 0; t<1; t++)
            {
                for(int y = 0; y<5; y++)
                {
                    System.out.print(table[t][y]);
                }
                System.out.println();
            }
            for(int p = 0; p<MAX_NO_OF_PROJECTS; p++)
            {
                projects[p].disPlay(0);
            }
        System.out.println("Modified Table");
        System.out.println("**************");
        
            String table1[][] = new String[1][5];
            table1[0][0] = "Project ID ";
            table1[0][1] = "Indicator 1 ";
            table1[0][2] = "Indicator 2 ";
            table1[0][3] = "Indicator 3 ";
            table1[0][4] = "Indicator 4 ";
            for(int w = 0; w<1; w++)
            {
                for(int z = 0; z<5; z++)
                {
                    System.out.print(table[w][z]);
                }
                System.out.println();
            }

            for(int r = 0; r<MAX_NO_OF_PROJECTS; r++)
            {
                projects[r].disPlay(1);
            }
            System.out.println("Final Table");
            System.out.println("***********");

            String[][] table2 = new String[1][8];
            table2[0][0] = "Project ID ";
            table2[0][1] = "Indicator 1 ";
            table2[0][2] = "Indicator 2 ";
            table2[0][3] = "Indicator 3 ";
            table2[0][4] = "Indicator 4 ";
            table2[0][5] = "Weighted Mean ";
            table2[0][6] = "Segment ";
            table2[0][7] = "Credibility";
            for(int b = 0; b<1; b++)
                {
                    for(int d = 0; d<8; d++)
                    {
                        System.out.print(table2[b][d]);
                    }
                    System.out.println();
                }
            
            for(int f = 0; f<MAX_NO_OF_PROJECTS; f++)
            {
                projects[f].disPlay(2);
            }
    }
    int total = 0;
    int rateSum = 0;
    int invMoney;
    int finalCount = 0;
    int finalPayback;
    int invCount;
    int rest = MAX_INVESTABLE_AMOUNT;
    public void makeDecision()
    {
        investableProjects = new Project[MAX_NO_OF_PROJECTS];
        
        for(int a = 0; a < MAX_NO_OF_PROJECTS; a++)
        {
            if(projects[a].getCredibility().equals("Invest"))
            {
                investableProjects[invCount] = projects[a];
                invCount++;
                total = total + projects[a].getPaybackRate();
                rateSum = rateSum + projects[a].getPaybackRate();
            }
        }
            finalProjects = new Project[invCount];
            String task1[][] = new String[invCount+2][3];
            System.out.println("Task 1");
            System.out.println("*******");
            task1[0][0] = "Project ID ";
            task1[0][1] = "Capital ";
            task1[0][2] = "Payback ";
            for(int e = 1; e <= invCount; e++)
            {
                task1[e][0] = investableProjects[e-1].getID() + "   ";
                task1[e][1] = Integer.toString(investableProjects[e-1].getRequiredMoney())+ "   ";
                task1[e][2] = Integer.toString(investableProjects[e-1].getPaybackRate())+ "   ";
            }
            task1[invCount+1][0] = "Total: ";
            task1[invCount+1][1] = Integer.toString(total);
            task1[invCount+1][2] = Integer.toString(rateSum);
        for(int f = 0; f < invCount+1; f++)
        {
            for(int r = 0; r < 3; r++)
            {
                System.out.print(task1[f][r] + "    ") ;
            }
            System.out.println();
        }
        
        
        System.out.println("Task 2");
        System.out.println("****");
        if(total < MAX_INVESTABLE_AMOUNT)
        {
            
            System.out.println("We cannot invest in all projects, we have to discard some of them.");
            for(int u = 0; u < 4; u++)
            {
                String[] check = new String[4];
                check[0] = "A+";
                check[1] = "A";
                check[2] = "B";
                check[3] = "C";
                for(int n = 0; n < invCount; n++)
                {
                    if(investableProjects[n].getSegment().equals(check[u]) && rest >= investableProjects[n].getRequiredMoney())
                    {
                        finalProjects[finalCount] = investableProjects[n];
                        invMoney = invMoney + finalProjects[finalCount].getRequiredMoney();
                        finalPayback = finalPayback + (finalProjects[finalCount].getRequiredMoney()*finalProjects[finalCount].getPaybackRate());
                        rest = rest - finalProjects[finalCount].getRequiredMoney();
                        finalCount++;
                    }
                    else{}

                }

            } 
        }
        else
        {
            finalCount = invCount;
            for(int y = 0; y < invCount; y++)
            {
                finalPayback = finalPayback + (investableProjects[y].getRequiredMoney()*investableProjects[y].getPaybackRate());
            }
        }
        System.out.print("Final Portfolio: ");
        for(int m = 0; m < finalCount; m++)
        {
            System.out.print(String.format("%-6s", finalProjects[m].getID()));
        }
        System.out.println();
        System.out.println("Invested Amount: " + invMoney);
        System.out.println("Expected Payback Amount: " + finalPayback);
        System.out.println("Rest Of Budget:" + (MAX_INVESTABLE_AMOUNT - invMoney));
    }

    public static void main(String[] args) 
    {
        Hackathon hackathon = new Hackathon();
        
        int[] A1 = {100,240,16,25,67991};
        Project P1 = new Project("A1", A1);
        addProject(P1);
        
        int[] A2 = {20,407,13,11,860657};
        Project P2 = new Project("A2", A2);
        addProject(P2);
        
        int[] A3 = {100,281,13,39,193696};
        Project P3 = new Project("A3", A3);
        addProject(P3);
        
        int[] A4 = {80,1264,4,38,382208};
        Project P4 = new Project("A4", A4);
        addProject(P4);
       
        int[] A5 = {20,1020,12,11,958624};
        Project P5 = new Project("A5", A5);
        addProject(P5);
        
        int A6[] = {100,1162,17,34,1140003};
        Project P6 = new Project("A6", A6);
        addProject(P6);
        
        
        
        // PRINT INITIAL TABLE
        
        
        P1.calcModifiedScores();
        P2.calcModifiedScores();
        P3.calcModifiedScores();
        P4.calcModifiedScores();
        P5.calcModifiedScores();
        P6.calcModifiedScores();

        //Print Modified Table 
       
        

        P1.calcWeightAvg();
        P2.calcWeightAvg();
        P3.calcWeightAvg();
        P4.calcWeightAvg();
        P5.calcWeightAvg();
        P6.calcWeightAvg();

        P1.calcSegment();
        P2.calcSegment();
        P3.calcSegment();
        P4.calcSegment();
        P5.calcSegment();
        P6.calcSegment();

        P1.calcCredibility();
        P2.calcCredibility();
        P3.calcCredibility();
        P4.calcCredibility();
        P5.calcCredibility();
        P6.calcCredibility();

        //Print Final Table
        

        showTable(projects);
        hackathon.makeDecision();

        
    }

}
