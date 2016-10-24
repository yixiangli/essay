/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name Computer.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.Facade 
 * @Date 2016年6月30日下午2:59:49 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.Facade;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月30日
 * @since JDK 1.7
 * @Function 电脑，作为cpu，硬盘，内存的外观
 * @Reason
 */
public class ComputerFacade {

	private CPU cpu;
    private Memory memory;
    private Disk disk;
 
    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }
 
    public void startup() {
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }
 
    public void shutdown() {
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
