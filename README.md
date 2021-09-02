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
TimeAgo v1.0.0

--------

# Usage
## Gradle 

open your build.gradle and add the following line:
```
implementation 'io.github.anass-abea:timeago:1.0.0'
```

## Maven
Open your POM.xml and add the following lines inside the `<dependencies>` Tag
```
<dependency>
    <groupId>io.github.anass-abea</groupId>
    <artifactId>TimeAgo</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Code

### Simple
```
/**
    timeUntil(long) | timeUntil(java.util.date) | timeUntil (Instant)
*/

TimeAgo timeAgo = new TimeAgo();
String fuzzyTimeStamp = timeAgo.timeUntil(new Date());
```

### With different start date:

```
/**
        Constructors:
    TimeAgo() | TimeAgo(long) | TimeAgo(java.util.date) | TimeAgo(Instant) 
*/

TimeAgo timeAgo = new TimeAgo(25548354);
String fuzzyTimeStamp = timeAgo.timeUntil(new Date());
```


### With different Language:
The default language is English you can change it using the language Method.
```
/**
        Languages:
    Languages.English_US , Languages.French_FR
*/

TimeAgo timeAgo = new TimeAgo(new Date());
String fuzzyTimeStamp1 = timeAgo.language(Languages.French_FR).timeUntil(new Date());
String fuzzyTimeStamp2 = timeAgo.language(Languages.English_US).timeUntil(new Date());
```

You can add your own using the interface Language

```

Language myLanguage = new Language(){...}

TimeAgo timeAgo = new TimeAgo(new Date());
timeAgo.language(myLanguage);
String fuzzyTimeStamp = timeAgo.timeUntil(new Date());
```

# Contribute
This project is open source, we use our free time to build and maintain it. The code is available and can be used, forked and modified.

When requesting or submitting new features, first consider whether it might be useful to others. 

You can create a [pull request](https://github.com/Anass-ABEA/TimeAgo/pulls), note that a pull request should have the modifications made, and a justification alongside with tests (if applicable).
