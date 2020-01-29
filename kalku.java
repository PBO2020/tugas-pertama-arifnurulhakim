public class kalku {    
    public static void main(String[] args) {
        data qwe = new data();
       
        System.out.println("TAMBAH");
        qwe.setangka1(24);
        qwe.setangka2(12);
        System.out.println("angka 1  = "+qwe.getangka1());
        System.out.println("angka 2  = "+qwe.getangka2());
        System.out.println(qwe.getangka1()+" + "+qwe.getangka2()+" = "+qwe.getplus());
        System.out.println("");
        System.out.println("KURANG");
        qwe.setangka1(564);
        qwe.setangka2(542);
        System.out.println("angka 1  = "+qwe.getangka1());
        System.out.println("angka 2  = "+qwe.getangka2());
        System.out.println(qwe.getangka1()+" - "+qwe.getangka2()+" = "+qwe.getmin());
        System.out.println("");
        System.out.println("KALI");
        qwe.setangka1(43);
        qwe.setangka2(12);
        System.out.println("angka 1  = "+qwe.getangka1());
        System.out.println("angka 2  = "+qwe.getangka2());
        System.out.println(qwe.getangka1()+" * "+qwe.getangka2()+" = "+ qwe.getx());
        System.out.println("");
        System.out.println("BAGI");
        qwe.setangka1(985);
        qwe.setangka2(5);
        System.out.println("angka 1  = "+qwe.getangka1());
        System.out.println("angka 2  = "+qwe.getangka2());
        System.out.println(qwe.getangka1()+" : "+qwe.getangka2()+" = "+qwe.getbg());
}
}