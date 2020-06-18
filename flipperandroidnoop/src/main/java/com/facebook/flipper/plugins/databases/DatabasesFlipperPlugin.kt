package com.facebook.flipper.plugins.databases

import android.content.Context
import com.kgurgul.flipper.RealmDatabaseDriver
import com.kgurgul.flipper.RealmDatabaseProvider

class DatabasesFlipperPlugin(context: Context){

    constructor(realmDatabaseDriver: RealmDatabaseDriver) : this(realmDatabaseDriver.context)
}


