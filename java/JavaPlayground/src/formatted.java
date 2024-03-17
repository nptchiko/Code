import java.text.DecimalFormat;

class formatted{
    public static void main(String[] args){
        float a = 13.142464252f;
        System.out.printf("%.12f\n",a );
        System.out.printf("%.5f\n", a);

        DecimalFormat formatter = new DecimalFormat("###.####");
        System.out.println(formatter.format(a));

    }
}