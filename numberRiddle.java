public class numberRiddle{
    public static void main(String[] arg){
        int round = 1000;
        double num;
        num = Double.parseDouble(arg[0]);
        double init;
        init = Double.parseDouble(arg[0]);
        System.out.println("We double the number: "+num+"*2 = "+(num*2));
        num*=2;
        System.out.println("We add 6 to the number: "+num+"+6 = "+
        (double)(((int)((num+6)*round))/(double)round));
        num = (double)(((int)((num+=6)*round))/(double)round);
        System.out.println("We halve the number: "+num+"/2 = "+
        (double)(((int)((num/2)*round))/(double)round));
        num = (double)(((int)((num/=2)*round))/(double)round);
        System.out.println("We subtract the original number: "+
        num+"-"+init+" = "+(double)(((int)((num-init)*round))/(double)round));
        System.out.println("The output is 3 as always");

    }
}