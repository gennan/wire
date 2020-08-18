/*
 * Copyright 2013 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire

import com.squareup.javapoet.JavaFile
import com.squareup.kotlinpoet.FileSpec
import com.squareup.wire.schema.ProtoType
import java.nio.file.Path
import io.outfoxx.swiftpoet.FileSpec as SwiftFileSpec

interface WireLogger {
  fun setQuiet(quiet: Boolean)
  fun artifact(outputPath: Path, filePath: String)
  fun artifact(outputPath: Path, javaFile: JavaFile)
  fun artifact(outputPath: Path, kotlinFile: FileSpec)
  fun artifact(outputPath: Path, type: ProtoType, swiftFile: SwiftFileSpec)
  fun artifactSkipped(type: ProtoType)
  fun info(message: String)
}
