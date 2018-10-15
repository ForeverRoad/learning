package cn.imzcf.designPatterns.strategy;

/**
 * 使用斧头劈
 */
public class AxeBehavior implements WeaponBehavior{
    public void useWeapon() {
        System.out.println("斧头帮～～～");
    }
}
