
# PushNotification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The push notification UUID. |  [optional]
**userId** | [**UUID**](UUID.md) | The UUID of the user to receive the push notification. |  [optional]
**title** | **String** | The title of the push notification. |  [optional]
**body** | **String** | The content of the push notification. |  [optional]
**platform** | [**PlatformEnum**](#PlatformEnum) | The platform on which the push notification will be sent. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the push notification. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the push notification was created. |  [optional]


<a name="PlatformEnum"></a>
## Enum: PlatformEnum
Name | Value
---- | -----
ANDROID | &quot;android&quot;
IOS | &quot;ios&quot;
WEB | &quot;web&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SENT | &quot;sent&quot;
DELIVERED | &quot;delivered&quot;
OPENED | &quot;opened&quot;
FAILED | &quot;failed&quot;



