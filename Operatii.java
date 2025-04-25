public class Operatii {

    //eliminare semnele de punctuație
    public String StergeSemn(String text)
    {
        String ceva=text;
        String []semne={".",",",";","(",")",":","\"","'"};

        int n=semne.length;
        for(int i=0;i<n;i++)
        {
            ceva=ceva.replace(semne[i],"");
        }
        return ceva;
    }
    /*
    //eliminare cifre
    public String StergeCifre(String text)
    {
        String ceva=text;
        return ceva;
    }
     */
}
