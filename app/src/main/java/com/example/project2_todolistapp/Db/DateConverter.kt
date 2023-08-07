package com.example.project2_todolistapp.Db

import androidx.room.TypeConverter
import java.nio.file.LinkOption
import java.sql.Timestamp
import java.util.Date

// 3.TypeCoverter -> Used when you want to add some custom object in your DB

class DateConverter {
    // ToCovert Date to Long -> push data into the db
    @TypeConverter
    fun fromDateTOLong(date: Date):Long{
        return date.time
    }

    // to convert long to date -> reading the data from the Data base
    @TypeConverter
    fun fromLongToDate(timestamp: Long): Date {
        return  Date(timestamp)
    }

}