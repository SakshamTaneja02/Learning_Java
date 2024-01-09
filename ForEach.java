class ForEach{
    public static void main(String args[]){
        float []marks = {98.1f,100.02f,98.70f,100.8f,98.87f};
        String []strawhats = {"Luffy","Zoro","Sanji","Nami","Jimbei","Robin","Franky","Chopper","Brook","Ussop"};
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        for(String i:strawhats)
        {
            System.out.println(i);
        }
    }
}