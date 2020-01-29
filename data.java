public class data {

   int angka1;
   int angka2;
   int min;
   int x;
   int bg;
   int plus;
   

    public int getangka1() {
        return angka1;
    }
    public void setangka1(int angka1) {
        this.angka1= angka1;
    }
    public int getangka2() {
        return angka2;
    }
    public void setangka2(int angka2) {
        this.angka2 = angka2;
    }
    public int getplus(){
        plus = angka1 + angka2;
        return plus;
    }
    public void setjum(int plus) {
        this.plus = plus;
    }
    public int getmin() {
        min = angka1 - angka2;
        return min;
    }
    public void setmin(int min) {
        this.min = min;
    }
    public int getx() {
        x = angka1*angka2;
        return x;
    }
    public void setx(int x) {
        this.x = x;
    }
    public int getbg() {
        bg = angka1/angka2;
        return bg;
    }
    public void setbg(int bg) {
        this.bg = bg;
    }
    }