public class array {
    static class add
    {
        int[] tab_1=new int[3];


        int[] tab_2=new int[3];
        public void add(int[] tab_1,int []tab_2)
        {
            this.tab_1=tab_1;
            this.tab_2=tab_2;
        }
        public int get()
        {
            tab_1[0]=20;
            tab_1[1]=12;
            tab_1[2]=5;
            tab_2[0]=4;
            tab_2[1]=3;
            tab_2[2]=6;
            return tab_1[0]+tab_1[1]+tab_1[2]+tab_2[0]+tab_2[1]+tab_2[2];
        }
    }
    public static void main(String[] args) {
        add m1=new add();
       System.out.println(m1.get());
    }

}
