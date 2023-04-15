
# FriendRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The friend request&#39;s UUID. |  [optional]
**senderId** | [**UUID**](UUID.md) | The UUID of the user who sent the friend request. |  [optional]
**receiverId** | [**UUID**](UUID.md) | The UUID of the user who received the friend request. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the friend request. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the friend request was created. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
ACCEPTED | &quot;accepted&quot;
REJECTED | &quot;rejected&quot;
CANCELLED | &quot;cancelled&quot;



