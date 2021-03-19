package com.qiuxk.more_thread.base.service.impl;

import com.qiuxk.more_thread.base.service.Updater;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledUpdater {

    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    private long initialDelaySeconds;
    private long periodInSeconds;
    private Updater updater;


    public ScheduledUpdater(Updater updater,long initialDelaySeconds,long periodInSeconds){
        this.updater=updater;
        this.initialDelaySeconds=initialDelaySeconds;
        this.periodInSeconds=periodInSeconds;
    }

    public void run(){
        executorService.scheduleAtFixedRate(()->updater.update(),initialDelaySeconds,periodInSeconds, TimeUnit.SECONDS);
    }


}

