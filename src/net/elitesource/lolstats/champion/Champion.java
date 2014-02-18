package net.elitesource.lolstats.champion;

import java.io.Serializable;

public class Champion implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6721156345424737980L;
	private String name;
	private float health, healthPerLevel, healthRegen, healthRegenPerLevel, mana, manaPerLevel, manaRegen, manaRegenPerLevel, attackDamage, attackDamagePerLevel, attackSpeed, attackSpeedPerLevel, armor, armorPerLevel, magicResist, magicResistPerLevel, movementSpeed, movementSpeedPerLevel, range, CDR, criticalStrikeChance, GP5, lifeSteal, spellVamp;

	public Champion(String name, float health, float healthPerLevel, float healthRegen, float healthRegenPerLevel, float mana, float manaPerLevel, float manaRegen, float manaRegenPerLevel, float attackDamage, float attackDamagePerLevel, float attackSpeed, float attackSpeedPerLevel, float armor, float armorPerLevel, float magicResist, float magicResistPerLevel, float movementSpeed, float range)
	{
		super();
		this.name = name;
		this.health = health;
		this.healthPerLevel = healthPerLevel;
		this.healthRegen = healthRegen;
		this.healthRegenPerLevel = healthRegenPerLevel;
		this.mana = mana;
		this.manaPerLevel = manaPerLevel;
		this.manaRegen = manaRegen;
		this.manaRegenPerLevel = manaRegenPerLevel;
		this.attackDamage = attackDamage;
		this.attackDamagePerLevel = attackDamagePerLevel;
		this.attackSpeed = attackSpeed;
		this.attackSpeedPerLevel = attackSpeedPerLevel;
		this.armor = armor;
		this.armorPerLevel = armorPerLevel;
		this.magicResist = magicResist;
		this.magicResistPerLevel = magicResistPerLevel;
		this.movementSpeed = movementSpeed;
		this.range = range;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the health
	 */
	public float getHealth()
	{
		return health;
	}

	/**
	 * @param health
	 *            the health to set
	 */
	public void setHealth(float health)
	{
		this.health = health;
	}

	/**
	 * @return the healthPerLevel
	 */
	public float getHealthPerLevel()
	{
		return healthPerLevel;
	}

	/**
	 * @param healthPerLevel
	 *            the healthPerLevel to set
	 */
	public void setHealthPerLevel(float healthPerLevel)
	{
		this.healthPerLevel = healthPerLevel;
	}

	/**
	 * @return the healthRegen
	 */
	public float getHealthRegen()
	{
		return healthRegen;
	}

	/**
	 * @param healthRegen
	 *            the healthRegen to set
	 */
	public void setHealthRegen(float healthRegen)
	{
		this.healthRegen = healthRegen;
	}

	/**
	 * @return the healthRegenPerLevel
	 */
	public float getHealthRegenPerLevel()
	{
		return healthRegenPerLevel;
	}

	/**
	 * @param healthRegenPerLevel
	 *            the healthRegenPerLevel to set
	 */
	public void setHealthRegenPerLevel(float healthRegenPerLevel)
	{
		this.healthRegenPerLevel = healthRegenPerLevel;
	}

	/**
	 * @return the mana
	 */
	public float getMana()
	{
		return mana;
	}

	/**
	 * @param mana
	 *            the mana to set
	 */
	public void setMana(float mana)
	{
		this.mana = mana;
	}

	/**
	 * @return the manaPerLevel
	 */
	public float getManaPerLevel()
	{
		return manaPerLevel;
	}

	/**
	 * @param manaPerLevel
	 *            the manaPerLevel to set
	 */
	public void setManaPerLevel(float manaPerLevel)
	{
		this.manaPerLevel = manaPerLevel;
	}

	/**
	 * @return the manaRegen
	 */
	public float getManaRegen()
	{
		return manaRegen;
	}

	/**
	 * @param manaRegen
	 *            the manaRegen to set
	 */
	public void setManaRegen(float manaRegen)
	{
		this.manaRegen = manaRegen;
	}

	/**
	 * @return the manaRegenPerLevel
	 */
	public float getManaRegenPerLevel()
	{
		return manaRegenPerLevel;
	}

	/**
	 * @param manaRegenPerLevel
	 *            the manaRegenPerLevel to set
	 */
	public void setManaRegenPerLevel(float manaRegenPerLevel)
	{
		this.manaRegenPerLevel = manaRegenPerLevel;
	}

	/**
	 * @return the attackDamage
	 */
	public float getAttackDamage()
	{
		return attackDamage;
	}

	/**
	 * @param attackDamage
	 *            the attackDamage to set
	 */
	public void setAttackDamage(float attackDamage)
	{
		this.attackDamage = attackDamage;
	}

	/**
	 * @return the attackDamagePerLevel
	 */
	public float getAttackDamagePerLevel()
	{
		return attackDamagePerLevel;
	}

	/**
	 * @param attackDamagePerLevel
	 *            the attackDamagePerLevel to set
	 */
	public void setAttackDamagePerLevel(float attackDamagePerLevel)
	{
		this.attackDamagePerLevel = attackDamagePerLevel;
	}

	/**
	 * @return the attackSpeed
	 */
	public float getAttackSpeed()
	{
		return attackSpeed;
	}

	/**
	 * @param attackSpeed
	 *            the attackSpeed to set
	 */
	public void setAttackSpeed(float attackSpeed)
	{
		this.attackSpeed = attackSpeed;
	}

	/**
	 * @return the attackSpeedPerLevel
	 */
	public float getAttackSpeedPerLevel()
	{
		return attackSpeedPerLevel;
	}

	/**
	 * @param attackSpeedPerLevel
	 *            the attackSpeedPerLevel to set
	 */
	public void setAttackSpeedPerLevel(float attackSpeedPerLevel)
	{
		this.attackSpeedPerLevel = attackSpeedPerLevel;
	}

	/**
	 * @return the armor
	 */
	public float getArmor()
	{
		return armor;
	}

	/**
	 * @param armor
	 *            the armor to set
	 */
	public void setArmor(float armor)
	{
		this.armor = armor;
	}

	/**
	 * @return the armorPerLevel
	 */
	public float getArmorPerLevel()
	{
		return armorPerLevel;
	}

	/**
	 * @param armorPerLevel
	 *            the armorPerLevel to set
	 */
	public void setArmorPerLevel(float armorPerLevel)
	{
		this.armorPerLevel = armorPerLevel;
	}

	/**
	 * @return the magicResist
	 */
	public float getMagicResist()
	{
		return magicResist;
	}

	/**
	 * @param magicResist
	 *            the magicResist to set
	 */
	public void setMagicResist(float magicResist)
	{
		this.magicResist = magicResist;
	}

	/**
	 * @return the magicResistPerLevel
	 */
	public float getMagicResistPerLevel()
	{
		return magicResistPerLevel;
	}

	/**
	 * @param magicResistPerLevel
	 *            the magicResistPerLevel to set
	 */
	public void setMagicResistPerLevel(float magicResistPerLevel)
	{
		this.magicResistPerLevel = magicResistPerLevel;
	}

	/**
	 * @return the movementSpeed
	 */
	public float getMovementSpeed()
	{
		return movementSpeed;
	}

	/**
	 * @param movementSpeed
	 *            the movementSpeed to set
	 */
	public void setMovementSpeed(float movementSpeed)
	{
		this.movementSpeed = movementSpeed;
	}

	/**
	 * @return the movementSpeedPerLevel
	 */
	public float getMovementSpeedPerLevel()
	{
		return movementSpeedPerLevel;
	}

	/**
	 * @param movementSpeedPerLevel
	 *            the movementSpeedPerLevel to set
	 */
	public void setMovementSpeedPerLevel(float movementSpeedPerLevel)
	{
		this.movementSpeedPerLevel = movementSpeedPerLevel;
	}

	/**
	 * @return the range
	 */
	public float getRange()
	{
		return range;
	}

	/**
	 * @param range
	 *            the range to set
	 */
	public void setRange(float range)
	{
		this.range = range;
	}

	/**
	 * @return the cDR
	 */
	public float getCDR()
	{
		return CDR;
	}

	/**
	 * @param cDR
	 *            the cDR to set
	 */
	public void setCDR(float cDR)
	{
		CDR = cDR;
	}

	/**
	 * @return the criticalStrikeChance
	 */
	public float getCriticalStrikeChance()
	{
		return criticalStrikeChance;
	}

	/**
	 * @param criticalStrikeChance
	 *            the criticalStrikeChance to set
	 */
	public void setCriticalStrikeChance(float criticalStrikeChance)
	{
		this.criticalStrikeChance = criticalStrikeChance;
	}

	/**
	 * @return the gP5
	 */
	public float getGP5()
	{
		return GP5;
	}

	/**
	 * @param gP5
	 *            the gP5 to set
	 */
	public void setGP5(float gP5)
	{
		GP5 = gP5;
	}

	/**
	 * @return the lifeSteal
	 */
	public float getLifeSteal()
	{
		return lifeSteal;
	}

	/**
	 * @param lifeSteal
	 *            the lifeSteal to set
	 */
	public void setLifeSteal(float lifeSteal)
	{
		this.lifeSteal = lifeSteal;
	}

	/**
	 * @return the spellVamp
	 */
	public float getSpellVamp()
	{
		return spellVamp;
	}

	/**
	 * @param spellVamp
	 *            the spellVamp to set
	 */
	public void setSpellVamp(float spellVamp)
	{
		this.spellVamp = spellVamp;
	}

}
