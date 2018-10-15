package cn.imzcf.designPatterns.strategy;

/**
 * 国王战士
 */
public class King extends Character {
    public void fight() {
        this.weaponBehavior.useWeapon();
    }
}
