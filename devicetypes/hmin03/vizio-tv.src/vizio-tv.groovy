/**
 *  Vizio TV Device Handler
 *
 *  Copyright 2018 Harold Min
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
 
metadata {
    definition (name: "Vizio TV", namespace: "hmin03", author: "Harold Min") {
	capability "Actuator"
        capability "Polling"
        capability "Refresh"
	capability "Switch"
    }

    tiles(scale: 2) {
        standardTile("refresh", "device.refresh", inactiveLabel: false, decoration: "flat", height: 2, width: 2) {
            state "default", action:"refresh.refresh", icon:"st.secondary.refresh"
        }
        main("refresh")
    }
}