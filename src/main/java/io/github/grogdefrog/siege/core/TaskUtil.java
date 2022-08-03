package io.github.grogdefrog.siege.core;

import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.monster.EntityZombie;


public class TaskUtil{

    // idea for having clonable entities will not work.
    // java is too fucked and I don't understand enough of it to make it work. This will have to do for now.
    // If you find a better way let me know @dleiferives



    public void removeTasks(EntityAITasks tasks, EntityAITasks targetTasks)
    {
        tasks.taskEntries.clear();
        targetTasks.taskEntries.clear();
    }
    public EntityZombie SiegeifyZombie(EntityZombie entityZombie)
    {
        //System.out.println(" tasks count" + entityZombie.tasks.taskEntries.size() + " target tasks count" + entityZombie.targetTasks);
        this.removeTasks(entityZombie.tasks,entityZombie.targetTasks);
        //System.out.println(" tasks count" + entityZombie.tasks.taskEntries.size() + " target tasks count" + entityZombie.targetTasks);

        return entityZombie;
    }

}
