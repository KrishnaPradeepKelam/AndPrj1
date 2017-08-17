# Pre-work - *AndPrj1*

AndPrj1 is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: Krishna Pradeep V Kelam	

Time spent: 26 hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **successfully add and remove items** from the todo list
* [X] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [X] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:


<a href="https://imgflip.com/gif/1u8dba"><img src="https://i.imgflip.com/1u8dba.gif" title="made at imgflip.com"/></a>
## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

This is the first time i have ever developed an Andriod project. I am very amazed with the Android App development. I felt nice seeing the App working.
Android studio is really a good editor to code and design the UI. Working on Android is making me explore more things on Android.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

- An adapter is a bridge between UI component and data source that helps us to fill data in UI component. It holds the data and then sends the data to Adapter view
- ArrayAdapter is a utility function used for listview or grid view which converts and show each object data from the list of objects. 
- In the pre-work example we use ArrayAdapter for handling the listview which holds the list of user entered data.
- The default ArrayAdapter converts an array item into a String object putting it into a TextView. 
- The text view is then displayed in the AdapterView , after creating the Adapter we need to supply the layout for displaying each array string such as 'simple_list_item_1'
-'convertView' this is used for increasing the performance by re-using the old view. If the list view has more entries and layout shows less items,
  then on scolling down 'covertView' shall re-use the previously created object views instead of creating new Objects.
  

## Notes

I am new to Android developement. The Video provided for  basic desing was really helpfull to start with.
One issue which i faced was when i was trying to create layout with out having relative layout used.
I did face some issues for creating Intent but was able to resolve it my self.

## License

    Copyright [2017] [KrishnaPradeepKelam]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
