public class dice_throw {
    public static void main(String[] args) {
        dice_combination("",3);

    }
    public static void dice_combination(String p,int target){
        if (target==0){
            System.out.println(p);
            return ;

        }
        for (int i = 1; i <=6 &&i<=target; i++) {
         dice_combination(p+i,target-1);



        }
    }
}
