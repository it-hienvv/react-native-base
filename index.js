/**
 * @format
 * @lint-ignore-every XPLATJSCOPYRIGHT1
 */

import {AppRegistry} from 'react-native';
import {name as appName} from './app.json';

import FbLogin from './src/screens/fblogin/index'
import Firebase from './src/screens/firebase/index'

import Maps from './src/screens/googlemaps/index'

AppRegistry.registerComponent(appName, () => Maps);
