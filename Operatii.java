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

    //eliminare cifre
    public String StergeCifre(String text)
    {
        String ceva=text;
        ceva=ceva.replaceAll("([1-9])", "");
        return ceva;
    }

    //Inversare litere
    public String InversLitere(String text)
    {
        String ceva="";

        int n=text.length();
        for(int i=0;i<n;i++)
        {
            char c=text.charAt(i);

            if(Character.isLetter(c))
            {
                if(Character.isUpperCase(c))
                {
                    ceva=ceva+Character.toLowerCase(c);
                }
                else
                {
                    ceva=ceva+Character.toUpperCase(c);
                }
            }
            else
            {
                ceva=ceva+c;
            }
        }
        return ceva;
    }

    //eliminare spatii multiple
    public String StergereSpatii(String text)
    {
        String ceva=text;
        ceva=ceva.replaceAll("\\s+"," ").trim();
        return ceva;
    }

}
