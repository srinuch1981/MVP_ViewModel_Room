# MVP_ViewModel_Room

baseArch has the basic implementation to check presenter is present or not and will attach and detach view

TasksFragment uses the Android Architecture components remain UI uses Loaders to retain presenter in configuration changes.

1. ViewModel will be cleared when process killed(save and restore scenario we can't use this)
2. ViewModel can be used to communicate with multiple fragments in sameActivity provided activityContext
3. AndroidViewModel  ->Takes Application context only
   vs ViewModel      -> we can pass Activity/Fragment
   
   
 


