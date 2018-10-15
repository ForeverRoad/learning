package cn.imzcf.designPatterns.strategy;

/**
 * 角色类，包含战斗方法，切换武器
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
    public abstract void fight();
}
