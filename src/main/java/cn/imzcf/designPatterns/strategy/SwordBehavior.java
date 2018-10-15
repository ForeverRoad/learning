package cn.imzcf.designPatterns.strategy;

/**
 * 使用宝剑砍
 */
public class SwordBehavior implements WeaponBehavior{
    public void useWeapon() {
        System.out.println("大宝剑～～～");
    }
}
