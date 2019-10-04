class AWTThread implements Runnable {
    private NURunner nuRunner;

    public AWTThread(NURunner nuRunner){
        this.nuRunner = nuRunner;
    }

    @Override
    public void run(){
        nuRunner.window.setVisible(true);
    }
}
