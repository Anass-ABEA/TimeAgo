# TimeAgo
Time ago is a Java library to display fuzzy timestamps like:
```
just now
-------------------
in 2 seconds
2 seconds ago
-------------------
1 hour ago
in 1 hour
-------------------
1 month ago
in 1 month
-------------------
21 years ago
in 21 years
-------------------
```

## Version
TimeAgo v1.0.2

--------

# Usage
## Gradle 

open your build.gradle and add the following line:
```
implementation 'io.github.anass-abea:timeago:1.0.2'
```

## Maven
Open your POM.xml and add the following lines inside the `<dependencies>` Tag
```
<dependency>
    <groupId>io.github.anass-abea</groupId>
    <artifactId>TimeAgo</artifactId>
    <version>1.0.2</version>
</dependency>
```

## Code

### Simple
You can generate relative date from now simply a `Date`, a `long` or an `Instant`
```
/**
    timeUntil(long) | timeUntil(java.util.date) | timeUntil (Instant)
*/
String sDate="06/11/2022";
Date date=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);  

TimeAgo timeAgo = new TimeAgo();
String fuzzyTimeStamp = timeAgo.timeUntil(date);  // 1 year ago
```

### With different start date:
Let's take the following dates as an example.
```
String sDate="06/11/2021";
Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);  

String sDate2="03/09/2021";
Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2); 
```
you can pass the reference date (from date) as a parameter to the constructor and pass the other date (to date) to the method like so:
```
TimeAgo timeAgo = new TimeAgo(date2);
String fuzzyTimeStamp = timeAgo.timeUntil(date1); // 2 months ago

TimeAgo timeAgo = new TimeAgo(date1);
String fuzzyTimeStamp = timeAgo.timeUntil(date2); // in 2 months
```


### With different Language:
The default language is English, you can either use the existing languages by using the `Languages` interface
```
/**
        Languages:
    Languages.English_US, Languages.French_FR, Languages.German_DE, Languages.Arabic_AR
*/

TimeAgo timeAgo = new TimeAgo();
String fuzzyTimeStamp1 = timeAgo.language(Languages.French_FR).timeUntil(new Date());  // maintenant
String fuzzyTimeStamp2 = timeAgo.language(Languages.English_US).timeUntil(new Date()); // just now
```

You can add your own using the interface Language

```
Language myLanguage = new Language(){...}

TimeAgo timeAgo = new TimeAgo(new Date());
timeAgo.language(myLanguage);
String fuzzyTimeStamp = timeAgo.timeUntil(new Date());
```

# Updates
## v1.0.2

- fixed null date bug
- added test cases
- changed now to ± 1 second to avoid `0 seconds ago`
- added Arabic and German languages
- fixed a typo in French language


# Contribute
This project is open source, we use our free time to build and maintain it. The code is available and can be used, forked and modified.

When requesting or submitting new features, first consider whether it might be useful to others. 

You can create a [pull request](https://github.com/Anass-ABEA/TimeAgo/pulls), note that a pull request should have the modifications made, and a justification alongside with tests (if applicable).
