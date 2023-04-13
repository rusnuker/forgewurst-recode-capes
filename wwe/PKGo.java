//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "F:\rusherhack"!

//Decompiled by Procyon!

package wwe;

import java.util.*;

public class PKGo
{
    public static ArrayList<UUID> users;
    public static final boolean \u200e;
    
    public PKGo() {
        final boolean \u200e = PKGo.\u200e;
    }
    
    public static void OyGy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: goto            8
        //     7: return         
        //     8: iload_3        
        //     9: ifne            7
        //    12: iload_3        
        //    13: ifne            7
        //    16: new             Ljava/net/URL;
        //    19: dup            
        //    20: ldc             "\u8f0e\u8f12\u8f12\u8f16\u8f15\u8f5c\u8f49\u8f49\u8f11\u8f11\u8f11\u8f48\u8f02\u8f14\u8f09\u8f16\u8f04\u8f09\u8f1e\u8f48\u8f05\u8f09\u8f0b\u8f49\u8f15\u8f49\u8f15\u8f09\u8f13\u8f1f\u8f57\u8f51\u8f04\u8f0c\u8f5f\u8f08\u8f09\u8f55\u8f17\u8f50\u8f53\u8f49\u8f31\u8f31\u8f23\u8f25\u8f07\u8f16\u8f03\u8f2a\u8f0f\u8f15\u8f12\u8f48\u8f12\u8f1e\u8f12\u8f59\u8f14\u8f07\u8f11\u8f5b\u8f57"
        //    22: ldc             -81817754
        //    24: invokestatic    wwe/jtnJ$xkKY.kXYT:(Ljava/lang/String;I)Ljava/lang/String;
        //    27: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    30: astore_0       
        //    31: iload_3        
        //    32: ifne            7
        //    35: iload_3        
        //    36: ifne            7
        //    39: new             Ljava/io/BufferedReader;
        //    42: dup            
        //    43: new             Ljava/io/InputStreamReader;
        //    46: dup            
        //    47: aload_0         /* jHuS */
        //    48: invokedynamic   BootstrapMethod #0, \u2004\u2009\u200e\u2009\u200f\u2007\u200f\u2005\u200e\u2000:(Ljava/lang/Object;)Ljava/io/InputStream;
        //    53: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    56: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    59: astore_1       
        //    60: iload_3        
        //    61: ifne            7
        //    64: iload_3        
        //    65: ifne            7
        //    68: aload_1         /* pMle */
        //    69: invokedynamic   BootstrapMethod #1, \u200c\u2004\u2002\u2003\u2001\u2001\u2007\u2002\u2009\u200e:(Ljava/lang/Object;)Ljava/lang/String;
        //    74: dup            
        //    75: astore_2        /* oYNg */
        //    76: ifnull          118
        //    79: iload_3        
        //    80: ifne            7
        //    83: iload_3        
        //    84: ifne            7
        //    87: getstatic       wwe/PKGo.PtUQ:Ljava/util/ArrayList;
        //    90: aload_2         /* oYNg */
        //    91: invokedynamic   BootstrapMethod #2, \u2000\u2009\u200d\u2005\u200e\u2001\u2004\u200c\u2008\u2000:(Ljava/lang/String;)Ljava/util/UUID;
        //    96: invokedynamic   BootstrapMethod #3, \u200a\u200d\u2000\u200b\u200f\u200f\u200a\u200b\u2002\u200c:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   101: pop            
        //   102: iload_3        
        //   103: ifne            7
        //   106: getstatic       wwe/PKGo.\u200e:Z
        //   109: ifeq            64
        //   112: aconst_null    
        //   113: athrow         
        //   114: nop            
        //   115: nop            
        //   116: nop            
        //   117: athrow         
        //   118: iload_3        
        //   119: ifne            7
        //   122: aload_1         /* pMle */
        //   123: invokedynamic   BootstrapMethod #4, \u200e\u200c\u200b\u2000\u200e\u200d\u200b\u2007\u2009\u2001:(Ljava/lang/Object;)V
        //   128: iload_3        
        //   129: ifne            7
        //   132: iload_3        
        //   133: ifne            7
        //   136: getstatic       wwe/PKGo.\u200e:Z
        //   139: ifeq            149
        //   142: aconst_null    
        //   143: athrow         
        //   144: astore_0       
        //   145: iload_3        
        //   146: ifne            7
        //   149: iload_3        
        //   150: ifne            7
        //   153: return         
        //    StackMapTable: 00 07 FF 00 07 00 04 00 00 00 01 00 00 00 FF 00 37 00 04 07 00 19 07 00 27 00 01 00 00 FF 00 31 00 00 00 01 07 00 14 FF 00 03 00 04 07 00 19 07 00 27 07 00 72 01 00 00 FF 00 19 00 04 00 00 00 01 00 01 07 00 17 FF 00 04 00 04 07 00 05 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  12     114    144    149    Ljava/lang/Exception;
        //  118    132    144    149    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static boolean UBRO(final UUID isCapeUser) {
        final boolean \u200e = PKGo.\u200e;
        return \u200e || \u200e || invokedynamic(\u2002\u200a\u2005\u2004\u2006\u200d\u200d\u200b\u2009\u2007:(Ljava/lang/Object;Ljava/lang/Object;)Z, PKGo.users, isCapeUser);
    }
    
    static {
        final boolean \u200e2 = PKGo.\u200e;
        if (!\u200e2 && !\u200e2) {
            PKGo.users = new ArrayList<UUID>();
            if (!\u200e2) {
                return;
            }
        }
    }
}
