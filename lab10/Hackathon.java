public class Hackathon 
{
    private static int MAX_NO_OF_PROJECTS = 6;
    private static int INDICATOR_COUNT  = 4;
    private static int[] INDICATOR_WEIGHTS = {10, 25, 30, 35};
    private static int projectCount;
    private static Project[] projects ;
    

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

    public static void main(String[] args) 
    {
        Hackathon hackathon = new Hackathon();
        
        int[] A1 = {100,240,16,25};
        Project P1 = new Project("A1", A1);
        addProject(P1);
        
        int[] A2 = {20,407,13,11};
        Project P2 = new Project("A2", A2);
        addProject(P2);
        
        int[] A3 = {100,281,13,39};
        Project P3 = new Project("A3", A3);
        addProject(P3);
        
        int[] A4 = {80,1264,4,38};
        Project P4 = new Project("A4", A4);
        addProject(P4);
       
        int[] A5 = {20,1020,12,11};
        Project P5 = new Project("A5", A5);
        addProject(P5);
        
        int A6[] = {100,1162,17,34};
        Project P6 = new Project("A6", A6);
        addProject(P6);
        
        
        
        // PRINT INITIAL TABLE
        System.out.println("Initial Table");
        System.out.println("*************");
        
        P1.calcModifiedScores();
        P2.calcModifiedScores();
        P3.calcModifiedScores();
        P4.calcModifiedScores();
        P5.calcModifiedScores();
        P6.calcModifiedScores();

        //Print Modified Table 
        System.out.println("Modified Table");
        System.out.println("**************");
        

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
        System.out.println("Final Table");
        System.out.println("***********");

        showTable(projects);

        
    }

}
