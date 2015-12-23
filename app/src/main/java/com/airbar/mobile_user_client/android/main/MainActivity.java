package com.airbar.mobile_user_client.android.main;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.airbar.mobile_user_client.android.R;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public String TAG = "MYTAG---AIRBAR!!!!!!!!!!!!!!!!!!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Check for an existing Account:
        AccountManager accountManager = AccountManager.get(this);
        List<Account> accounts = Arrays.asList(accountManager.getAccounts());

        Account account = new Account();
        account.
        accountManager.addAccountExplicitly()

        Log.d(TAG, "accounts list.size: " + accounts.size());
        for (int i = 0; i < 1000; i++)
            Log.d(TAG, "Printing out accounts list...");
        for (Account account : accounts) {
            Log.d(TAG, "Account: " + account.name);
            Log.d(TAG, "Account: " + account.toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
