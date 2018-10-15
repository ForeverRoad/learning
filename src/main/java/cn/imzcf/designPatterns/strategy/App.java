package cn.imzcf.designPatterns.strategy;

public class App {

    public static void main(String[] args) {
        King king = new King();
        System.out.println("板斧出门装");
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();

        System.out.println("获得大宝剑一把");
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();

    }
}
