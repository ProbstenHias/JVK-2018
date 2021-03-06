/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.function.Supplier;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.EntityType;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;

/**
 * base class for Task 7 of sheet 1
 * @author Dilara
 */
abstract public class AB1_Task7 extends TaskTemplate {
    protected final Mario mario;
    protected final Coin coin;
    
    public AB1_Task7() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            ed.add(new WorldObject(EntityType.WALL, 1, 0));
            ed.add(new WorldObject(EntityType.WALL, 3, 0));
            ed.add(new WorldObject(EntityType.WALL, 5, 0));
            ed.add(new WorldObject(EntityType.WALL, 3, 1));
            ed.add(new WorldObject(EntityType.WALL, 7, 1));
            ed.add(new WorldObject(EntityType.WALL, 8, 1));
            ed.add(new WorldObject(EntityType.WALL, 0, 2));
            ed.add(new WorldObject(EntityType.WALL, 1, 2));
            ed.add(new WorldObject(EntityType.WALL, 5, 2));
            ed.add(new WorldObject(EntityType.WALL, 6, 2));
            ed.add(new WorldObject(EntityType.WALL, 7, 2));
            ed.add(new WorldObject(EntityType.WALL, 1, 3));
            ed.add(new WorldObject(EntityType.WALL, 3, 3));
            ed.add(new WorldObject(EntityType.WALL, 5, 3));
            ed.add(new WorldObject(EntityType.WALL, 7, 3));
            ed.add(new WorldObject(EntityType.WALL, 8, 3));
            ed.add(new WorldObject(EntityType.WALL, 9, 3));
            ed.add(new WorldObject(EntityType.WALL, 3, 4));
            return ed.result();
        }).get(), "Task1_7");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0, Direction.SOUTH);
        this.coin = new Coin(this.simulation);
        this.coin.spawn(8, 2);

    }
    
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        
    }
}
