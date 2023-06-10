# GRPC(Redux_Movies_Compose)

Sometimes developers want to differentiate themselves from others. This repository was created a few years ago while I was working at the University of Sharif. Now, I have found some time to update and maintain the code. I remember when I first heard of gRPC, I was struggling with REST APIs. However, using gRPC with Android has been much easier for me. In this repository, I have used various technologies such as Redux, Jetpack Compose, and many others..

So first clone this repository for a run in client Python
Server: https://github.com/M-CAP7AIN/gRPC-Python-Server and set your Ip in BaseIp in (Constance
class in client). before that, you should read some articles about Grpc technology.

```kotlin
object Constance {
    const val BaseIp = ""
    const val BasePort = 50051
    const val NoError = "NoError"
}
```

And There are Three Grpc Services (Unray) for Communication with the server.

1 - get list Movies with filter ( GetVideosX ).

2 - Search ( SearchVideosX ).

3 - banner ( GetHeadersX ).

```kotlin
service Body {
    rpc GetVideosX (VideoListXRequest) returns (VideoListXReply) {}
    rpc SearchVideosX (VideoListXRequest) returns (VideoListXReply) {}
    rpc GetHeadersX (VideoHeaderXRequest) returns (VideoHeaderXReply) {}
}

message VideoListXRequest {
    string filter = 1;
}

message VideoListXReply {
    repeated VideoListXModel VideoListX = 1;
}

message VideoListXModel {
    int32 ID = 1;
    string Name = 2;
    string Description = 3;
    string Picture = 4;
    string Category = 5;
    int32 Views = 6;
    int32 Year = 7;
    string Director = 8 ;
    string Cast = 9;
}

message VideoHeaderXRequest {
    string filter = 1;
}

message VideoHeaderXReply {
    repeated VideoHeaderXModel VideoHeaderX = 1;
}

message VideoHeaderXModel {
    int32 ID = 1;
    int32 ID_VIDEO = 2;
    string Name = 3;
    string Description = 4;
    string Picture = 5;
}
```

## Technologies used

+ GRPC
+ Jetpack compose
+ REDUX (uniDirectional data flow)
+ navigation (compose accompanist)
+ UnitTest ( grpcTest - Mock)
+ coroutines - flow
+ and so many animation

## document about REDUX

I think the best repository for the description of Redux is this repository with video and enough
documents : https://github.com/AdamMc331/MVIExample

<img src="/images/main_page.png" width="300">  <img src="/images/detail_page.png" width="300"> <img src="/images/search_page.png" width="300">











 
