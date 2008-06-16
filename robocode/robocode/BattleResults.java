/*******************************************************************************
 * Copyright (c) 2001, 2008 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package robocode;

/**
 * @author Pavel Savara (original)
 */
public class BattleResults implements java.io.Serializable {
    private static final long serialVersionUID = 2L;

    private int rank;
    private double score;
    private double survival;
    private double lastSurvivorBonus;
    private double bulletDamage;
    private double bulletDamageBonus;
    private double ramDamage;
    private double ramDamageBonus;
    private int firsts;
    private int seconds;
    private int thirds;


    /**
     * Constructs a new RobotResults.
     *
     * @param rank              the rank of the robot in the battle
     * @param score             the total score for the robot in the battle
     * @param survival          the survival score for the robot in the battle
     * @param lastSurvivorBonus the last survivor bonus for the robot in the battle
     * @param bulletDamage      the bullet damage score for the robot in the battle
     * @param bulletDamageBonus the bullet damage bonus for the robot in the battle
     * @param ramDamage         the ramming damage for the robot in the battle
     * @param ramDamageBonus    the ramming damage bonus for the robot in the battle
     * @param firsts            the number of rounds this robot placed first
     * @param seconds           the number of rounds this robot placed second
     * @param thirds            the number of rounds this robot placed third
     */
    public BattleResults(
            int rank,
            double score,
            double survival,
            double lastSurvivorBonus,
            double bulletDamage,
            double bulletDamageBonus,
            double ramDamage,
            double ramDamageBonus,
            int firsts,
            int seconds,
            int thirds
    ) {
        this.rank = rank;
        this.score = score;
        this.survival = survival;
        this.lastSurvivorBonus = lastSurvivorBonus;
        this.bulletDamage = bulletDamage;
        this.bulletDamageBonus = bulletDamageBonus;
        this.ramDamage = ramDamage;
        this.ramDamageBonus = ramDamageBonus;
        this.firsts = firsts;
        this.seconds = seconds;
        this.thirds = thirds;
    }

    /**
     * Returns the rank of this robot in the battle results.
     *
     * @return the rank of this robot in the battle results.
     */
    public int getRank() {
        return rank;
    }

    /**
     * Returns the total score of this robot in the battle.
     *
     * @return the total score of this robot in the battle.
     */
    public int getScore() {
        return (int) (score + 0.5);
    }

    /**
     * Returns the survival score of this robot in the battle.
     *
     * @return the survival score of this robot in the battle.
     */
    public int getSurvival() {
        return (int) (survival + 0.5);
    }

    /**
     * Returns the last survivor score of this robot in the battle.
     *
     * @return the last survivor score of this robot in the battle.
     */
    public int getLastSurvivorBonus() {
        return (int) (lastSurvivorBonus + 0.5);
    }

    /**
     * Returns the bullet damage score of this robot in the battle.
     *
     * @return the bullet damage score of this robot in the battle.
     */
    public int getBulletDamage() {
        return (int) (bulletDamage + 0.5);
    }

    /**
     * Returns the bullet damage bonus of this robot in the battle.
     *
     * @return the bullet damage bonus of this robot in the battle.
     */
    public int getBulletDamageBonus() {
        return (int) (bulletDamageBonus + 0.5);
    }

    /**
     * Returns the ram damage score of this robot in the battle.
     *
     * @return the ram damage score of this robot in the battle.
     */
    public int getRamDamage() {
        return (int) (ramDamage + 0.5);
    }

    /**
     * Returns the ram damage bonus of this robot in the battle.
     *
     * @return the ram damage bonus of this robot in the battle.
     */
    public int getRamDamageBonus() {
        return (int) (ramDamageBonus + 0.5);
    }

    /**
     * Returns the number of rounds this robot placed first in the battle.
     *
     * @return the number of rounds this robot placed first in the battle.
     */
    public int getFirsts() {
        return firsts;
    }

    /**
     * Returns the number of rounds this robot placed second in the battle.
     *
     * @return the number of rounds this robot placed second in the battle.
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Returns the number of rounds this robot placed third in the battle.
     *
     * @return the number of rounds this robot placed third in the battle.
     */
    public int getThirds() {
        return thirds;
    }
}