package process;

public class p31 extends android.app.Service
{
    @Override
    public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
    }
	@Override
    public void onCreate() {
		super.onCreate();
		common.overlay.start(this,31);
		}
	@Override
    public void onDestroy() {
		super.onDestroy();
		System.exit(0);
		}
}
