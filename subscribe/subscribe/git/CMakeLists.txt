cmake_minimum_required(VERSION 2.8.7)
project(subscribe)
set(CMAKE_BUILD_TYPE Debug)



set (THREADS_PREFER_PTHREAD_FLAG ON)
find_package(Threads REQUIRED)



set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

include_directories(${CMAKE_CURRENT_SOURCE_DIR})

## binary files
add_executable(subscribe main.cpp)

## link binaries
target_include_directories(subscribe PUBLIC "/home/piyush.asalmol/IOT/build-webos-iot/BUILD/work/raspberrypi3-webos-linux-gnueabi/paho-mqtt-cpp/1.0.0-r0/image/usr/include/mqtt")
target_link_libraries(subscribe paho-mqttpp3)
target_include_directories(subscribe PUBLIC "/home/piyush.asalmol/IOT/build-webos-iot/BUILD/work/raspberrypi3-webos-linux-gnueabi/paho-mqtt-c/1.2.1-r0/image/usr/include")
TARGET_LINK_LIBRARIES(subscribe paho-mqtt3a)




install(TARGETS subscribe DESTINATION bin)
