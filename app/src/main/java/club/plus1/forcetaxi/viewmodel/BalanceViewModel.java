package club.plus1.forcetaxi.viewmodel;

import android.content.Context;
import android.content.Intent;

import club.plus1.forcetaxi.R;
import club.plus1.forcetaxi.model.Server;
import club.plus1.forcetaxi.service.ActiveLog;
import club.plus1.forcetaxi.view.BalanceRechargeActivity;
import club.plus1.forcetaxi.view.BalanceRechargeResultActivity;
import club.plus1.forcetaxi.view.BalanceSberbankActivity;
import club.plus1.forcetaxi.view.BalanceSberbankResultActivity;
import club.plus1.forcetaxi.view.EnterSplashActivity;

public class BalanceViewModel {

    private static BalanceViewModel mInstance;
    private Server server;

    public int balance;
    public String result;
    public String status;
    public String amount;
    public String gett;
    public String ytaxi;
    public String city;
    public String bolt;
    public String phone;

    private BalanceViewModel(Context context) {
        ActiveLog.getInstance().log();
        server = Server.getInstance(context);
        balance = 0;
    }

    public static BalanceViewModel getInstance(Context context) {
        ActiveLog.getInstance().log();
        if (mInstance == null) {
            mInstance = new BalanceViewModel(context);
        }
        return mInstance;
    }

    public void onRecharge(Context context) {
        ActiveLog.getInstance().log();
        Intent intent = new Intent(context, BalanceRechargeActivity.class);
        context.startActivity(intent);
    }

    public void onRechargeSberbank(Context context) {
        ActiveLog.getInstance().log();
        server.refillBalance(context, amount, gett);
        status = server.getArgs().get("status").toString();
        if (server.isOk()) {
            result = context.getString(R.string.text_search_inn_success, status);
        } else {
            result = context.getString(R.string.text_search_inn_error, server.getError().getText());
        }
        Intent intent = new Intent(context, BalanceRechargeResultActivity.class);
        context.startActivity(intent);
    }

    public void onSendSberbank(Context context) {
        ActiveLog.getInstance().log();
        Intent intent = new Intent(context, BalanceSberbankActivity.class);
        context.startActivity(intent);
    }

    public void onResult(Context context) {
        ActiveLog.getInstance().log();
        Intent intent = new Intent(context, EnterSplashActivity.class);
        context.startActivity(intent);
    }

    public void onSendLink(Context context) {
        ActiveLog.getInstance().log();
        server.sendSMS(context, phone);
        Intent intent = new Intent(context, BalanceSberbankResultActivity.class);
        context.startActivity(intent);
    }

    public void onSberbankResult(Context context) {
        ActiveLog.getInstance().log();
        Intent intent = new Intent(context, EnterSplashActivity.class);
        context.startActivity(intent);
    }
}
